package Defaning_an_IP_Adddres;

public class SolutionIPAddres {
    
    public String defangIPaddr(String address) {
        StringBuilder restAddres = new StringBuilder();
        for(char characterAdddress : address.toCharArray())
            restAddres.append((characterAdddress == '.' ?"[" +characterAdddress + "]" : characterAdddress).toString());
        return restAddres.toString();    
    }
}