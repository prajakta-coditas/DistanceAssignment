package com.company;

public class myclass {
int count=0;
String ans="";
    public void rev(String s,String s1)
    {
   //     System.out.println("heyy");

        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ans= ans+s.charAt(i);
            }
            s=s.replace(s.charAt(i),' ');
        }
        System.out.println(ans);

        //changing string

        for(int k=0;k< ans.length();k++){
            for(int j=0;j<s1.length();j++){


                String a= Character.toString(ans.charAt(k));
                if (s1.contains(a)){
                    s1.replace(a,a);
                    count++;
                    break;
                }


            }

        }
        System.out.println("Your string : "+s1 +"  is changed " +count +" times. ");
    }
}
