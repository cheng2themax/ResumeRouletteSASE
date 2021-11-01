import java.util.Scanner;
import java.util.Random;
import java.util.Arrays; 
import java.util.ArrayList;
public class ResumeRoulette {


    public static String[] scienceExp = { "Research at Feinstein Institute" , "Published in Nature Magazine" };
    public static String[] scienceExp1 = { "CHE 131 TA"};
    public static String[] scienceExp2 = { "Interned at Memorial Sloan Kettering"};
    public static String[] techExp = {"Zebra Technologies Intern", "Amazon SDE Internship", "MasterCard Internship" };
    public static String[] techExp1 = {"SBU Hacks participant"};
    public static String[] techExp2 = {};
    String[] engineeringExp = { "PSEG Intern", "SBU MotorSports Member", "Boeing Intern", "Interned at NASA" };
    public static String[] engineeringExp1 = {};
    public static String[] engineeringExp2 = {};
    public static String[] mathExp = {};
    public static String[] mathExp1 = {};
    public static String[] mathExp2 = {};

    public static String[] miscExp = {"Captain of Varsity Basketball Team", "E-Board member of SASE", "SASE Mentee"};
    public static String[] hardSkills = {"Python", "Java", "JavaScript", "LaTex", "Git", "Microsoft Excel", "Microsoft Word", "Microsoft Powerpoint"};
    public static String [] csFrameworks = {"Angular", "MERN stack", "CI/CD", "Android Frameworks"};
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //Prompt user for fictional roulette player's name 
        System.out.println("Give your person a name:");
        String personName = in.nextLine(); 
        System.out.println("Input Major:  AMS BCH BIO BME CHE CIV CME CSE ECE ESE ISE MAT MEC PHY TSM ");
        String major = in.next(); 
        System.out.println("Profile Name: " + personName);
    
        //SCIENCE 
        if (major.equals("CHE") || major.equals("BIO") || major.equals("BCH")){
            System.out.println(science());
        }
        //TECHNOLOGY
        if (major.equals("CSE") || major.equals("ISE") || major.equals("TSM")){
            System.out.println(technology());
        }
        //ENGINEERING
        else if (major.equals("BME") || major.equals("CIV") || major.equals("CME") || major.equals("ECE") ){
            System.out.println(engineering());
        }
        //MATHEMATICS 
        else {
            System.out.println(mathematics());
        }



    }


    // CHE BIO BCH
    public static String science() {
        ArrayList<String> resume = new ArrayList<String>(); 

        // GENERATE SKILLS
        String newSkill = hardSkills[(int) (Math.random() * hardSkills.length)];
        resume.add(newSkill);
        int skillCount = 1;
        
        int maxSkill = (int) (Math.random() * hardSkills.length);
        while (skillCount < maxSkill) {
            // reset what newSkill is
            newSkill = hardSkills[(int) (Math.random() * hardSkills.length)];
            if (!resume.contains(newSkill)) {
                resume.add(newSkill);
                skillCount++;
            }
        }
        return resume.toString();
    }
   
    //CSE TSM ISE 
    public static String technology(){
        ArrayList<String> resume = new ArrayList<String>();

        // GENERATE SKILLS
        String newSkill = hardSkills[(int)(Math.random()*hardSkills.length)];
        resume.add(newSkill);
        int skillCount = 1;

        int maxSkill = (int)(Math.random() * hardSkills.length);
        while (skillCount < maxSkill){
            //reset what newSkill is
            newSkill = hardSkills[(int)(Math.random()*hardSkills.length)];
            if (!resume.contains(newSkill)){
                resume.add(newSkill);
                skillCount++;
            }
        }
        return resume.toString();
    }



    // STUB CIV MEC ECE BME ESE CME
    public static String engineering() {
        ArrayList<String> resume = new ArrayList<String>();

        // GENERATE SKILLS
        String newSkill = hardSkills[(int) (Math.random() * hardSkills.length)];
        resume.add(newSkill);
        int skillCount = 1;

        int maxSkill = (int) (Math.random() * hardSkills.length);
        while (skillCount < maxSkill) {
            // reset what newSkill is
            newSkill = hardSkills[(int) (Math.random() * hardSkills.length)];
            if (!resume.contains(newSkill)) {
                resume.add(newSkill);
                skillCount++;
            }
        }
        return resume.toString();
    }

    public static String mathematics(){
        ArrayList<String> resume = new ArrayList<String>();

        //GENERATE SKILLS
        String newSkill = hardSkills[(int) (Math.random() * hardSkills.length)];
        resume.add(newSkill);
        int skillCount = 1;

        int maxSkill = (int) (Math.random() * hardSkills.length);
        while (skillCount < maxSkill) {
            // reset what newSkill is
            newSkill = hardSkills[(int) (Math.random() * hardSkills.length)];
            if (!resume.contains(newSkill)) {
                resume.add(newSkill);
                skillCount++;
            }
        }
        return resume.toString();
    }
}