public class StringOps {
    public static void main(String[] args) {
        String str = "My name is Abhi. Abhi works in Clairvoyant. Clairvoyant is in India";
        String arrStr[] = str.replace(".","").split(" ");
        for(int i = 0; i<arrStr.length-1; i++){
            for( int j = i+1; j<arrStr.length-1; j++){
               if(arrStr[i].equals(arrStr[j])){
                   System.out.println(arrStr[i]+" --> has a duplicate at array index: -->"+j);
               }
            }
        }
    }


}
