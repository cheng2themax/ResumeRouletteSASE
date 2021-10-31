import java.util.Scanner;
public class ResumeRoulette {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Give your person a name:");
        String personName = in.nextLine(); 
        System.out.println("Input Major:  AMS BCH BIO BME CHE CIV CME CSE ECE ESE ISE MAT MEC PHY TSM ");
        String major = in.next(); 

        switch(major){
            case "AMS":
                break;
            case "BCH":
                break;
            case "BIO":
                break;
            case "BME":
                break;
            case "CHE":
                break;
            case "CIV":
                break;
            case "CME":
                break;
            case "CSE":
                break;
            case "ECE":
                break;
            case "ESE":
                break;
            case "ISE":
                break;
            case "MAT":
                break;
            case "MEC":
                break;
            case "PHY":
                break;
            case "TSM":

            default:
                
        }



    }

    //STUB CIV MEC ECE
    public String engineering(){
        return "";
    }

    public String computer(){
        return "";
    }

}