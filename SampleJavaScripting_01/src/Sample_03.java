import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class Sample_03
{
 	 public static void main(String[] ages) throws IOException
	{
 		 //3_1==============================
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		
// 		br.close();
// 		 
//		if(x > y)
//		{
//			System.out.print("XはYより大きい");
//		}
//		br.close();
 		 
 		 //3_2==============================
 		 
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 
// 		 int x = Integer.parseInt(br.readLine());
// 		 int y = Integer.parseInt(br.readLine());
// 		 
// 		 br.close();
// 		
// 		if(y < x ) { System.out.print(x); }
// 		else {System.out.print(y); }
// 		
// 		br.close();
 		 
 		//3_3==============================
 		 
//  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 
// 		 int x = Integer.parseInt(br.readLine());
// 		 int y = Integer.parseInt(br.readLine());
// 		 
// 		br.close();
//
// 		if(y < x)   {System.out.print("Xの方がYより大きい");}
// 		else 		  {System.out.print("Yの方がXより大きい");}
// 		
// 		br.close();
 		 
 		 
 		//3_4==============================
 		 
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		
//		br.close(); 		 
// 		 
//		if		(x == y) {System.out.print("XとYは等しい");}
//		else if(y < x)   {System.out.print("Xの方がYより大きい");}
//		else 				 {System.out.print("Yの方がXより大きい");}
//		
//		br.close();
 		 
 		//3_5==============================
 		 
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 
// 		 int x = Integer.parseInt(br.readLine());
 //		 
// 		 br.close();
// 		 
// 		 if(x % 2 == 0) {System.out.print("偶数だよん");}
// 		 else {System.out.print("奇数だよん");}
// 		 
// 		 br.close();
 		 
 		//3_6==============================
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		 int x = Integer.parseInt(br.readLine());
//		 br.close();
//		 
//		 String positivity =		 (0 <= x) ? "正の" : "負の";
//		 String parity     = (x % 2 == 0) ? "偶数" : "奇数";
//		 
//		 System.out.print(positivity + parity + "です。");

 		//3_7==============================
 		 
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 int point = Integer.parseInt(br.readLine());
// 		 
//		 br.close(); 		 
//
// 		 //ケース1
// 		String score = (60 <= point) ? "合格\n" : "不合格\n";
//	    System.out.print(score);
//	    
//	    //ケース2
//	    if(80 <= point) {System.out.print("大変よくできました\n");}
//	 	else if(60 <= point) {System.out.print("よくできました\n");}
//	 	else 							  {System.out.print("残念でした\n");}
//	    
//	    //ケース3
// 		if		(80 <= point) {System.out.print("優");}
// 		else if(70 <= point) {System.out.print("良");}
// 		else if(60 <= point) {System.out.print("可");}
// 		else 						 {System.out.print("不可");}
 		 
 		 
 		 //3_8==============================
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 int scoreA = Integer.parseInt(br.readLine());
// 		int  scoreB = Integer.parseInt(br.readLine());
// 		
// 		 br.close();
 		 
// 		//両方とも60点以上の場合、合格
// 		if(60 <= scoreA && 60 <= scoreB) {System.out.print("合格\n");}
// 		else {System.out.print("不合格\n");}
// 		
// 		//合計が130点以上の場合、合格
// 		if(130 <= scoreA + scoreB) {System.out.print("合格\n");}
// 		else {System.out.print("不合格\n");}
// 		
// 		//合格が100点以上で、どちらかの試験が90点以上であれば合格
// 		if(100 <= scoreA + scoreB && (90 <= scoreA || 90 <= scoreB)) {System.out.print("合格\n");}
// 		else {System.out.print("不合格\n");}
 		
 		
 		//3_9==============================
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜 \n");
// 		 int Days = Integer.parseInt(br.readLine());
// 		 
// 		 System.out.print("0=午前、1=午後、2=夜間\n");
//		 int times = Integer.parseInt(br.readLine());
// 		 
//		 br.close();
//	 
//		 boolean isOpen = true;
// 		 if(Days == 0 && times == 0 || times == 1 || times == 2) {isOpen = false;}
// 		 else if(Days == 2  ||  Days == 5 && times == 0) {isOpen = false;}
// 		 else if(Days == 3 && times == 2) 					   {isOpen = false;}
// 		 else if(Days == 6 && times == 1 ||  times == 2) {isOpen = false;}
// 		 
// 		 if(isOpen == false) {System.out.print("休診日です");}
// 		 else         			    {System.out.print("診断日です");}
		 
 		//3_10==============================
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 
// 		 int x = Integer.parseInt(br.readLine());
// 		 int y = Integer.parseInt(br.readLine());
// 		 
// 		 br.close();
// 		 
// 		 if(x < y && (x % 2 == 0 && y % 2 == 0))  {System.out.print("xはyより小さく、かつ、xとyは共に偶数である。\n" );}
// 		 if(x == y && (x < 0 && y < 0)) 				  {System.out.print("xとyは等しく、かつ、負の数である。\n" );}
// 		 if(x < y || x % 2 == 0) 							  {System.out.print("xはyより小さい、または、xは偶数である。\n");}
// 		 if(x < 10 || 100 < x && 10 < y || y < 100) {System.out.print("xは10以下または100以上で、かつ、yは10以上かつ100以下である。\n");}
// 		 if(!(x < 0 && y < 0)) 								  {System.out.print( "xもyも負の数である、ではない。" );}
 		 
 		//3_11==============================
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		 System.out.print("1～12の間の数字を入力してください");
// 		 
// 		 int month = Integer.parseInt(br.readLine());
// 		 
// 		 br.close();
 		 
// 		 switch(month)
// 		 {
// 		 	case 1:
// 		 		 System.out.print("１月：元日、成人の日\n");
// 		 		 break;
// 		 		 
// 		 	case 2:
// 		 		 System.out.print("２月：建国記念の日、天皇誕生日\n");
// 		 		 break;
// 		 		 
// 		 	case 3:
// 		 		System.out.print("３月：春分の日\n");
// 		 		break;
// 		 		
// 		 	case 4:
// 		 		System.out.print("４月：昭和の日\n");
// 		 		break;
// 		 		
// 		 	case 5:
// 		 		System.out.print("５月：憲法記念日、みどりの日、こどもの日\n");
// 		 		break;
// 		 		
// 		 	case 7:
// 		 		System.out.print("7月：海の日\n");
// 		 		break;
// 		 		
// 		 	case 8:
// 		 		System.out.print("8月 : 山の日\n");
// 		 		break;
// 		 		
// 		 	case 9:
// 		 		System.out.print("9月 : 敬老の日、秋分の日\n");
// 		 		break;
// 		 		
// 		 	case 10:
// 		 		System.out.print("10月 : スポーツの日\n");
// 		 		break;
// 		 		
// 		 	case 11:
// 		 		System.out.print("11月 : 文化の日、勤労感謝の日\n");
// 		 		break;
// 		 }
 		 
 		//3_12==============================
// 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		 
// 		 System.out.print("まぐろ、えび、こはだ、どれにする？\n");
// 		 String susi = br.readLine();
// 		 
//		 br.close();
 		 
// 		 switch(susi)
// 		 {
// 		 	case "まぐろ":
// 			 System.out.print("1 : まぐろ");
// 			 break;
// 			 
// 		 	case "えび":
// 		 		System.out.print("2 : えび");
// 		 		break;
// 		 		
// 		 	case "こはだ":
// 		 		System.out.print("3 : こはだ");
// 		 		break;
// 		 }
 		 
 		 //3_13==============================
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	
 		int days = Integer.parseInt(br.readLine());

 		br.close();
 		
 		switch(days)
 		{
 		case 1,3,5,7,8,10,12:
 			System.out.print("31日");
 		break;
 		
 		case 4,6,9,11:
 			System.out.print("30日");
 		break;
 		
 		case 2:
 			System.out.print("28日");
 			
 		}
 		 
	}
}