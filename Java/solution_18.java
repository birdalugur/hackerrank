import java.util.*;
class Solution{
static boolean uygunMu(String gelenParantezKumesi)
    {
        List<String> kapaliParantez = Arrays.asList("}",")","]");
        boolean uygunMu = true;
        ArrayList<String> stack = new ArrayList<String>();

        if (gelenParantezKumesi.length()>0){
            for (int i = 0; i < gelenParantezKumesi.length(); i++){
                String parantez = gelenParantezKumesi.substring(i,i+1);

                if (stack.size() == 0 && kapaliParantez.contains(parantez)){
                    uygunMu = false;
                    break;
                }

                else{
                    if (parantez.equals("{") || parantez.equals("(") || parantez.equals("[")){
                        stack.add(parantez);
                    }
                    else {
                        String stackParantez = stack.get(stack.size()-1);
                        if (       (stackParantez.equals("{") && parantez.equals("}"))
                                || (stackParantez.equals("(") && parantez.equals(")"))
                                || (stackParantez.equals("[") && parantez.equals("]"))){
                            stack.remove(stack.size()-1);
                        }
                        else {
                            uygunMu = false;
                            break;
                        }
                    }
                }

            }
        }
        if (stack.size()>0) uygunMu=false;
        return uygunMu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            if(uygunMu(sc.nextLine())){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}