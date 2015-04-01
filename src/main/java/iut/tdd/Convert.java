package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	
		static Map<String,String> t = new HashMap<String,String>();
		static{
			t.put("0", "zéro");
			t.put("1", "un");
			t.put("2", "deux");
			t.put("3", "trois");
			t.put("4", "quatre");
			t.put("5", "cinq");
			t.put("6", "six");
			t.put("7", "sept");
			t.put("8", "huit");
			t.put("9", "neuf");
			t.put("10", "dix");
			t.put("11", "onze");
			t.put("12", "douze");
			t.put("13", "treize");
			t.put("14", "quatorze");
			t.put("15", "quinze");
			t.put("16", "seize");
			t.put("17", "dixsept");
			t.put("18", "dixhuit");
			t.put("19", "dixneuf");
			t.put("20", "vingt");
		}
		
		static Map<String,String> dizaine = new HashMap<String,String>();
		static{
			dizaine.put("1", "dix");
			dizaine.put("2", "vingt");
			dizaine.put("3", "trente");
			dizaine.put("4", "quarante");
			dizaine.put("5", "cinquante");
			dizaine.put("6", "soixante");
			dizaine.put("7", "soixante-dix");
			dizaine.put("8", "quatre-vingt");
			dizaine.put("9", "quatre-vingt-dix");
		}
		
		public static String num2text(String input) {
			
			if (t.containsKey(input)){
				return t.get(input);
			}
			else if(input.length()>1 && t.containsKey(input.substring(0,0)) && t.containsKey(input.substring(1,1))){
				return dizaine.get(input)+" "+t.get(input);
			}
			return null;
			
		
		/* if (input.equals("0")){return "zéro";}
		else if (input.equals("1")){return "un";}
		else if (input.equals("2")){return "deux";}
		else if (input.equals("3")){return "trois";}
		else if (input.equals("4")){return "quatre";}
		else if (input.equals("5")){return "cinq";}
		else if (input.equals("6")){return "six";}
		else if (input.equals("7")){return "sept";}
		else if (input.equals("8")){return "huit";}
		else if (input.equals("9")){return "neuf";}
		else if (input.substring(0,1).equals(1) && input.length()>1){
			if(input.substring(1,1).equals("1")){return "onze";}
			else if (input.substring(1,1).equals("2")){return "douze";}
			else if (input.substring(1,1).equals("3")){return "treize";}
			else if (input.substring(1,1).equals("4")){return "quatorze";}
			else if (input.substring(1,1).equals("5")){return "quinze";}
			else if (input.substring(1,1).equals("6")){return "seize";}
		}
		
		return null; */
		
	}
      
		
		
	public static String text2num(String input) {
		return "null";
	}
	

}