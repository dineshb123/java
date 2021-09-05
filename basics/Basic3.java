class Basic3
{
	public static void main(String args[])
	{
		System.out.println("30+20");//30+20
		System.out.println(30+20);//50
		System.out.println(10.25+10);//20.25
		System.out.println(10.25+10.25);//

		System.out.println(25+"Dinesh");//25Dinesh
		System.out.println(5+15+"java");//20java
		System.out.println("java"+5+15);//java515
		System.out.println("java"+(5+15));//java20
		
		System.out.println('A'+'B');//131
		System.out.println('A'+20);//85
		System.out.println('A'+"java");//Ajava
		System.out.println("Java"+" "+"Developer");//Java Devloper

		System.out.println(10+5+"java"+'a'+20);//15javaa20
		System.out.println('A'+10+"SQL"+true+(10+2));//75SQLtrue12
		System.out.println(true+"java"+10+"SQL"+20+5+'A');//truejava10SQL20A
		System.out.println("java"+('A'+'B')+'A'+'B'+20);//java131AB20

		//System.out.println(20+true); Error bad operand type
		System.out.println("20"+true);//20true

	}
}