public class hash_Brinda {
    
}

import java.util.Scanner;

class hash{
    Map<String,List<String>> h1=new HashMap<String,List<String>>();
     Map<String,Integer> h2=new HashMap<String,Integer>();
     void add(String key,String values){
         h1.put(key,value);
         System.out.println(h1);
     }
     void delete(int values){
         h2.remove(value);
         
         System.out.println(h2);
         
     }
     void fetchstudent(String key){
    if(h1.containskey(key)){
        List<Integer> s= new ArrayList<Integer>();
        List<String>list=h1.get(key);//keys corsecode
        List<String>key=h2.getset();//get the whole set of string corsecode))
         for(String l:list){//list
                    for(String k:keys){//key
                        if(l.equals(k)){//
                            s.add(map2.get(k));//get key of the day of exam andd store it in s
                        }
                    }
                }
         System.out.println(s);
            }
            else{
                System.out.println("No such doe");
            }
        }

}
class student extends hash{
public static void main(String[]args){
    List<String> a1 = new ArrayList<String>();
    a1.add(CSE1001);
     a1.add(CSE1007);
      a1.add(CSE1006);
    List<String> a2 = new ArrayList<String>();
    a2.add(CSE1001);
      a2.add(CSE1007);  
      List<String> a3 = new ArrayList<String>();
      a3.add(CSE1002);
      a3.add(CSE1003);
     List<String> a = new ArrayList<String>();
     
      
    h1.put("a",a1);
    h1.put("b",a2);
    h1.put("c",a3);
    
    h2.put("CSE1001",1);
    h2.put("CSE1002",2);
    h2.put("CSE1003",3);
    h2.put("CSE1006",4);
    h2.put("CSE1007",5);
    
    
     System.out.println("Fetching keys and corresponding [Multiple] Values :");//abc-keys
            for(Map.Entry<String,List<String>>entry1 : h1.entrySet())
            {
                String key1 = entry1.getKey();//abc
                List<String> values1 = entry1.getValue();
                System.out.println("Key = "+key1);
                System.out.println("Values = "+values1);
            }
            
            System.out.println("Fetching keys and corresponding [Single] Values :");
            for(Map.Entry<String , Integer> entry2 : h2.entrySet()){
                String key2 = entry2.getKey();
                List<String> values2 = entry2.getValue();
                System.out.println("Key = "+key2);
                System.out.println("Values = "+values2);
            }
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter choice : ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    Collection c1 = new Collection();
                    List<String> val = new ArrayList<String>();
                    //
                    c1.add("C",val);
                break;
                case 2 : 
                    Collection c2=new Collection();
                    c2.delete("A");
                break;
                
                case 3:
                    Collection c3=new Collection();
                    c3.fetchstudents("B");
                break;

                
                default:
                    System.out.println("error");
                    
            }
            
        }
        
    }
    }