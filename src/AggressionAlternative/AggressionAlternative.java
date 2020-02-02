
package AggressionAlternative;

public class AggressionAlternative {
    public static void main(String[] args) {
        
        Address address1 = new Address("Wan", "Sornolota", "Bangladesh");
        Address address2 = new Address("Wan", "ipti", "Bangladesh");
        
        Emp e = new Emp(1, "Wan Portfolio", address1);
        Emp e2 = new Emp(2, "Wan Jobs BD", address2);
        
        e.display();
        e2.display();
    }
 
}
