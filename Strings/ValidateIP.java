public class ValidateIP {


    public static void main(String[] args) {
        System.out.println(isValidIP("127.0.0.1")); //true
        System.out.println(isValidIP("127.a.0.1")); //false
        System.out.println(isValidIP("127.0234.0.1")); //false
        System.out.println(isValidIP("162.243.90.21")); //true
    }

    public static boolean isValidIP(String ip) {
        String[] ipOctet = ip.split("\\.");
        for(int i = 0; i < ipOctet.length; i++) {
            if(!validateOctet(ipOctet[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateOctet(String octet) {
        if(octet.length() > 3) {
            return false;
        }

        for(int i = 0; i < octet.length(); i++) {
            int eachDigit = (int) octet.charAt(i);
            if((eachDigit < 48) || (eachDigit > 57)) {
                return false;
            }
        }

        return true;
    }   

}
