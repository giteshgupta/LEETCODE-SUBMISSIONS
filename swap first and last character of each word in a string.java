import java.util.*;
class Result
{

  static String swapFirstLastChar(String str2)
  {
    
       String[] words=str2.split(" ");
       String h="";
		for(String o:words)
		{
			String sb=new String(o);
			char[] ch = new char[sb.length()]; 
        for (int i = 0; i < sb.length(); i++) { 
            ch[i] = sb.charAt(i); 
        } 
          char temp=ch[0];
          ch[0]=ch[sb.length()-1];
          ch[sb.length()-1]=temp;;
          String res=new String(ch);
          h+=res+" ";
		}
  return h.trim();
  }
}
