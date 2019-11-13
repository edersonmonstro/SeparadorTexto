import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class Main {

	/**
	 * exibe lista de candidatos em console do maior lugar para o menor
	 * @param lst
	 */
	public static void showList(List<Candidato> lst) {
		int count = 1;
		for (Candidato c : lst) {
			System.out.println(count + "º Lugar: " + c.getNota3() + " - " + c.getNome());
			count++;
		}

	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String filename = "resources/assistJudiciario.txt";

		String complete = IOUtils.toString(new FileInputStream(filename), StandardCharsets.ISO_8859_1).replace("\r", "")
				.replace("\t", "").replace("\n", "").trim();

		String[] cands = complete.split("/");

		List<Candidato> lst = new ArrayList<Candidato>();
		
		for (String string : cands) {
			String[] infocand = string.split(","); 
			Candidato c = new Candidato();
			c.setInscricao(infocand[0]);
			c.setNome(infocand[1]);
			c.setNota1(Double.valueOf(infocand[2]));
			c.setNota2(Double.valueOf(infocand[3]));
			c.setNota3(Double.valueOf(infocand[4]));
			lst.add(c);
		}

		
		
		Collections.sort(lst, new Candidato());

		Main.showList(lst);

	}
}
