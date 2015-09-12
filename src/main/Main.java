package main;

import java.util.Scanner;

public class Main {

	
	
	
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String yoko = J.YO +J.U +J.KO;
		
		String supeinjin =  J.SU + J.PE + J.I + J.N + J.ZI + J.N;
		
		String okasii =  J.O + J.KA + J.SI + J.I ;
		String keisanki = J.KE+J.I+J.SA+J.N+J.KI;
		
		String konichiwa = KO + N + NI + TI + WA;
		String ohayo = O + HA + YO + U;
		String kompanwa = KO + N + BA + N + WA;
		
		
		
		
		
		//quiero que pida un numero, luego otro numero y diga la suma de los numeros es: ...
		System.out.println("#########################");
		System.out.println("#                       #");
		System.out.println("#     "+ yoko + keisanki +"!!!!     #");
		System.out.println("#     "+ supeinjin + okasii +"               #");
		System.out.println("#                       #");
		System.out.println("#                       #");
		System.out.println("#########################");
		
		
		long millis = System.currentTimeMillis();
		long hour = (millis / (1000 * 60 * 60)) % 24 +2;
		
		if(hour >= 6 && hour < 12){
			System.out.println(ohayo);
		}else if(hour >= 12 && hour <19){
			System.out.println(konichiwa);
		}else{
			System.out.println(kompanwa);
		}
		String respuesta ;
		do{
			operacion();
			System.out.println(TU+DU+KE+RU+" s/n");
			respuesta = scan.nextLine();
		}while(!respuesta.equals("n"));
		
		System.out.println(SA+YO+NA+RA);
		
	}



	private static void operacion() {
		String yoko = J.YO +J.U +J.KO;
		String arigato = J.A+J.RI+J.GA+J.TO;
		
		
		System.out.println(BA + N + GO + U + I + tu + TE + "!! ^3^ ");

		int num = Integer.parseInt(scan.nextLine());
		
		System.out.println(arigato);
		
		System.out.println(J.TI +J.GA +J.U + J.BA +J.N +J.GO +J.U +J.I +J.tu +J.TE+ " "+smile+"!!  ");
		
		
		int num2 = Integer.parseInt(scan.nextLine());
		
		System.out.println(arigato);
		System.out.println(yoko + J.TO +J.I +J.tu +J.SI +J.yo +J.NI +J.A +J.SO +J.BO +" ^3^ !!!");
		System.out.println();
		System.out.println(J.NA +J.NI +J.SI +J.TA +J.I + " +, -, * o /?" +J.O +" · " +J.SI+" · "  +J.E+" · "  +J.TE);
		System.out.println();
		System.out.println(yoko + J.TI +J.ya +J.N +J.NI +J.MA +J.KA +J.SE +J.TE  +" "+smile+" !!!");
		String respuesta = scan.nextLine();
		
		if(respuesta.equals("+")){
			int suma = num + num2 ;
			
			System.out.println(J.KO +J.TA +J.E +J.HA + toJap(suma)+"  " +J.DA +J.YO + "!! ^3^ ");
			System.out.println();
			System.out.println("#########################");
			System.out.println("#                       #");
			System.out.println("#   " + yoko + arigato +"!!!!!!!     #");
			System.out.println("#   "+J.SU  +J.GO +"------"  +J.I +"!!!!!!    #");
			System.out.println("#########################");
			
		}
		
		
		if(respuesta.equals("-")){
			int suma = num - num2 ;
			
			System.out.println(J.HI + J.KU + J.TO + toJap(suma)+"  " +J.DA +J.YO + "!! ^3^ ");
			System.out.println();
			
			System.out.println("#########################");
			System.out.println("#                       #");
			System.out.println("#  "+ yoko +J.DA +J.I +J.SU +J.KI +"!!!!!!  #");
			System.out.println("#                       #");
			System.out.println("#########################");
			
		}
		
		if(respuesta.equals("*")){
			int suma = num * num2 ;
			
		
			
			System.out.println(J.KA +J.KE +J.RU +J.TO + toJap(suma)+"  " +J.DA +J.YO + "!! ^3^ ");
			System.out.println();
			System.out.println("#########################");
			System.out.println("#                       #");
			System.out.println("#   " + yoko + J.A +J.I +J.SI +J.TE + J.RU +"!!!!!!!    #");
			System.out.println("#   "+ J.KA +J.WA + J.I + "---!!!!!        #");
			System.out.println("#                       #");
			System.out.println("#########################");
		}
		
		if(respuesta.equals("/")){
			int suma = num / num2 ;
			
		
			System.out.println(J.WA +J.RU +J.TO + toJap(suma)+"  " +J.DA +J.YO + "!! ^3^ ");
			System.out.println();
			System.out.println("#########################");
			System.out.println("#                       #");
			System.out.println("#   " + yoko + J.BA +J.KA  +" > __ <   #");
			System.out.println("#                       #");
			System.out.println("#########################");
		}
	}



	public static String toJap(int num){
		char na = 0x306A;
		String nas = String.valueOf(na);
		
		char se = 0x305B;
		String ses = String.valueOf(se);
		
		char ro = 0x308D;
		String ros = String.valueOf(ro);
		
		char i = 0x3044;
		String is = String.valueOf(i);
		
		char chi = 0x3061;
		String chis = String.valueOf(chi);
		
		char ni = 0x306B;
		String nis = String.valueOf(ni);
		
		char sa = 0x3055;
		String sas = String.valueOf(sa);
		
		char n = 0x3093;
		String ns = String.valueOf(n);
		
		char yo = 0x3088;
		String yos = String.valueOf(yo);
		
		char go = 0x3054;
		String gos = String.valueOf(go);
		
		char ku = 0x304f;
		String kus = String.valueOf(ku);
		
		char ha = 0x306f;
		String has = String.valueOf(ha);
		
		char ki = 0x304d;
		String kis = String.valueOf(ki);
		
		char yu = 0x3085;
		String yus = String.valueOf(yu);
		
		char u = 0x3046;
		String us = String.valueOf(u);
		
		char ji = 0x3058;
		String jis = String.valueOf(ji);
		
		
		
		
		String[] array = {ses+ros, is + chis, nis, sas + ns, yos + ns, gos, ros + kus, nas + nas, has + chis, kis + yus +us};

		


		if(num < 10){
			return(array[num]);
		}else if(num < 100){

			int decenas = num /10; //5
			int unidades = num % 10; //4
			if(unidades == 0){
				if(decenas == 1){
					return(jis + yus +us);
				}else{
					return(array[decenas] + jis + yus +us);
				}

			}else{
				if(decenas == 1){
					return(jis + yus +us + array[unidades]);
				}else{
					return(array[decenas] + jis + yus +us + array[unidades]);
				}
			}

		}else{
			int centenas = num / 100; //8
			int decenas = (num / 10) % 10;  //9
			int unidades = num % 10;  //6
			if(centenas == 1){
				return(J.HI + J.ya + J.KU + array[decenas] + jis + yus +us + array[unidades]);
			}else{
				return(array[centenas] + J.HI + J.ya + J.KU + array[decenas] + jis + yus +us + array[unidades]);
			}
		}
	}


	public static final String  A   = "あ";
	public static final String  I   = "い";
	public static final String  U   = "う";
	public static final String  E   = "え";
	public static final String  O   = "お";
	public static final String	KA  = "か";	 
	public static final String	GA  = "が";	 
	public static final String	KI  = "き";	 
	public static final String	GI  = "ぎ";	
	
	
	public static char ku = 0x304f;
	public static final String	KU  = String.valueOf(ku);
	
	
	public static final String	GU  = "ぐ";	 
	public static final String	KE  = "け";	 
	public static final String	GE  = "げ";	 
	public static final String	KO  = "こ";	 
	public static final String	GO  = "ご";	 
	public static final String	SA  = "さ";	 
	public static final String	ZA  = "ざ";	 
	public static final String	SI  = "し";	 
	public static final String	ZI  = "じ";	 
	public static final String	SU  = "す";	 
	public static final String	ZU  = "ず";	 
	public static final String	SE  = "せ";	 
	public static final String	ZE  = "ぜ";	 
	public static final String	SO  = "そ";	 
	public static final String	ZO  = "ぞ";	 
	public static final String	TA  = "た";	 
	public static final String	DA  = "だ";	 
	public static final String	TI  = "ち";	 
	public static final String	DI  = "ぢ";	 
	public static final String	tu	= "っ";
	public static final String	TU  = "つ";	 
	public static final String	DU  = "づ";	 
	public static final String	TE  = "て";	 
	public static final String	DE  = "で";	 
	public static final String	TO  = "と";	 
	public static final String	DO  = "ど";	 
	public static final String	NA  = "な";	 
	public static final String	NI  = "に";	 
	public static final String	NU  = "ぬ";	 
	public static final String	NE  = "ね";	 
	public static final String	NO  = "の";	 
	public static final String	HA  = "は";	 
	public static final String	BA  = "ば";	 
	public static final String	PA  = "ぱ";	 
	public static final String	HI  = "ひ";	 
	public static final String	BI  = "び";	 
	public static final String	PI  = "ぴ";	 
	public static final String	HU  = "ふ";	 
	public static final String	BU  = "ぶ";	 
	public static final String	PU  = "ぷ";
	public static final String	HE  = "へ";	 
	public static final String	BE  = "べ";	 
	public static final String	PE  = "ぺ";	 
	public static final String	HO  = "ほ";	 
	public static final String	BO  = "ぼ";	 
	public static final String	PO  = "ぽ";	 
	public static final String	MA  = "ま";	 
	public static final String	MI  = "み";	 
	public static final String	MU  = "む";	 
	public static final String	ME  = "め";	 
	public static final String	MO  = "も";	 
	public static final String	ya  = "ゃ";	 
	public static final String	YA  = "や";	 
	public static final String	yu  = "ゅ";	 
	public static final String	YU  = "ゆ";
	
	public static char yy = 0x3087;
	public static final String	yo  = String.valueOf(yy);

	public static final String	YO  = "よ";	 
	public static final String	RA  = "ら";	 
	public static final String	RI  = "り";	 
	public static final String	RU  = "る";	 
	public static final String	RE  = "れ";	 
	public static final String	RO  = "ろ";	 
	public static final String	wa  = "ゎ";	 
	public static final String	WA  = "わ";	 
	public static final String	WI  = "ゐ";	 
	public static final String	WE  = "ゑ";	 
	public static final String	WO  = "を";	 
	public static final String	N   = "ん";
	
	
	
	
	public static char rrrr = 0x263a;
	public static final String	smile  = String.valueOf(rrrr);
	
}
