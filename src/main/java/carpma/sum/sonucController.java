package carpma.sum;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sonucController {
	
	@RequestMapping("submit")
	public String Sonuc(@RequestParam("S1") String s1, @RequestParam("S2") String s2,Model m) {
					
		String Num_1 = s1;
		String Num_2 = s2;
		String[] ere = new String[Num_1.length()];
		String yaz = "";
		int eld = 0;
		int snc;
		int[][] Carp = new int[10][10];
		int[][] Elde = new int[10][10];
		int[][] Toplam = new int[10][10];
		int[][] TElde = new int[10][10];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				Carp[i][j] = i * j % 10;  Elde[i][j] = i * j / 10; 	Toplam[i][j] = (i + j) % 10;  TElde[i][j] = (i + j) / 10;
			}
		int a = -1;
		for (int i = Num_1.length() - 1; i >= 0; i--) {
			a++;
			for (int j = Num_2.length() - 1; j >= 0; j--) {
				if (eld == 0) {
					snc = Carp[Integer.parseInt(Num_1.substring(i, i + 1))][Integer.parseInt(Num_2.substring(j, j + 1))];
					yaz = Integer.toString(snc) + yaz;
					eld = Elde[Integer.parseInt(Num_1.substring(i, i + 1))][Integer.parseInt(Num_2.substring(j, j + 1))];
				} else {
					snc = Carp[Integer.parseInt(Num_1.substring(i, i + 1))][Integer.parseInt(Num_2.substring(j, j + 1))]+ eld;
					if (snc >= 10) {
						snc = snc % 10;
						eld = (Integer.parseInt(Num_1.substring(i, i + 1)) * Integer.parseInt(Num_2.substring(j, j + 1))+ eld) / 10;
						yaz = Integer.toString(snc) + yaz;
					} else {
						yaz = Integer.toString(snc) + yaz;
						eld = Elde[Integer.parseInt(Num_1.substring(i, i + 1))][Integer.parseInt(Num_2.substring(j, j + 1))];
					}
				}
				if (j == 0 && eld > 0)
					yaz = eld + yaz;
			}
			eld = 0;
			if (yaz == null)
				break;
			ere[a] = yaz;
			yaz = "";
		}
		int sayi1;
		String toplaa;
		String yz = "";
		String sfr = "0";
		toplaa = ere[0];
		String erem;
		for (int i = 1; i < ere.length; i++) {
			erem = ere[i] + sfr;
			sfr = sfr + "0";
			for (int j = erem.length() - 1; j >= 0; j--) {
				if (eld == 0) {
					while (toplaa.length() != erem.length())
						toplaa = "0" + toplaa;

					sayi1 = Toplam[(int) toplaa.charAt(j) - (int) '0'][(int) erem.charAt(j) - (int) '0'];
					yz = Integer.toString(sayi1) + yz;
					eld = TElde[(int) toplaa.charAt(j) - (int) '0'][(int) erem.charAt(j) - (int) '0'];
				} else {
					sayi1 = Toplam[(int) toplaa.charAt(j) - (int) '0'][(int) erem.charAt(j) - (int) '0'] + eld;
					if (sayi1 == 10) {
						sayi1 = 0;
						eld = 1;
						yz = Integer.toString(sayi1) + yz;
					} else {
						yz = Integer.toString(sayi1) + yz;
						eld = TElde[(int) toplaa.charAt(j) - (int) '0'][(int) erem.charAt(j) - (int) '0'];
					}
				}
				if (j == 0 && eld > 0)
					yz = eld + yz;

			}
			toplaa = yz;
			yz = "";
			eld = 0;
		}
		m.addAttribute("carpim",toplaa);
		m.addAttribute("sayi1",Num_1.length());
		m.addAttribute("sayi2",Num_2.length());
		m.addAttribute("basamak",toplaa.length());
		
		
		return "index";
		
	}

}
