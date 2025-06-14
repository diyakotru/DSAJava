package DSAJava.POTD;

public class remapingDigit {
    public static void main(String[] args) {
        // Input: num = 11891
        // Output: 99009
        // sol: max val  = replace all occurenece of 1st digit with 9 -> 99899
        // min val= replace 1st digit with 0 if not so to make smallest no. ->00890
        //return the diff between 2 numbers formed

        int num=11891;
        String s=String.valueOf(num);
        int max=num;
        int min=num;

        //max val
        for(char ch : s.toCharArray()){
            if(ch!='9'){
                String newstr=s.replace(ch,'9');
                max=Integer.parseInt(newstr);
                break;
            }
            
        }

        //min value
        for(char ch : s.toCharArray()){
            if(ch!='0'){
                String newstr=s.replace(ch,'0');
                min=Integer.parseInt(newstr);
                break;
            }
            
        }
        System.out.println(max-min);

    }
}
