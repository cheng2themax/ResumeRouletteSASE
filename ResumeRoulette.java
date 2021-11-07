import java.util.Scanner;
import java.util.ArrayList;

// DRIVER CLASS 
public class ResumeRoulette {

    public static String[] scienceExp = { "Research at Feinstein Institute", "Published in Nature Magazine",
            "McCormick Intern", "Intern at Cold Spring Harbor" };
    public static String[] scienceExp1 = { "CHE 131 TA", "Science Olympiad Member" };
    public static String[] scienceExp2 = { "Interned at Memorial Sloan Kettering", "STEM Cell Engineering VIP", "Approaches for Tissue Engineered Kidneys VIP", "The Brain Team VIP" };

    public static String[] techExp = { "Zebra Technologies Intern", "Amazon SDE Internship", "MasterCard Internship",
            "Morgan Stanley Intern", "Solutions Architect Intern at Amazon", "Google SWE Intern",
            "Product Manager Intern at Facebook", "MongoDB Intern", "SalesForce Intern" };
    public static String[] techExp1 = { "SBU Hacks participant", "VIP Automotive Ethics", "VIP Web Genomics" };
    public static String[] techExp2 = { "CSE 101 TA", "WiCs Mentee" };

    public static String[] engineeringExp = { "PSEG Intern", "SBU MotorSports Member", "Boeing Intern",
            "Interned at NASA" };
    public static String[] engineeringExp1 = { "Solar Racing E-Board member", "PFizer BioTech I", "Regeneron Intern" };
    public static String[] engineeringExp2 = { "Physics tutor", "ASML intern", "Long Island Waste Management VIP", "AMMAT VIP" };

    public static String[] mathExp = { "HRT Intern", "2 Sigma Quant Intern", "NVIDIA Data Science Intern", "Roblox Data Science Intern" };
    public static String[] mathExp1 = { "AIME Qualifier", "TA AMS 301", "Math Research", "Math Fair Winner" };
    public static String[] mathExp2 = { "Math Circle Volunteer" };

    public static String[] miscExp = { "Captain of Varsity Basketball Team", "E-Board member of SASE", "SASE Mentee",
            "Chess Club E-Board", "Intramural Volleyball Captain", "Starbucks Barista", "Walmart Cashier" };

    // UNIVERSAL SKILLS APPLICABLE TO ALL STEM
    public static String[] hardSkills = { "Python", "Java", "JavaScript", "LaTex", "Git", "Microsoft Excel",
            "Microsoft Word", "Microsoft Powerpoint", "AutoCAD", "R", "MiniTab", "Linux", "Docker", "Adobe Photoshop" };

    // SCIENCE SPECIAL SKILLS x PROJECTS
    // public static String[] labSkills = {};
    public static String[] scienceProjects = {};

    // TECH SPECIAL SKILLS x PROJECTS
    public static String[] csFrameworks = { "Angular", "MERN stack", "CI/CD", "Android Frameworks", "C++", "C#",
            "Ocaml", "GoLang", "Rust", "TypeScript", "Ruby", "Scala", "Scheme", "Lisp", "MongoDB", "React", "AWS",
            "Kubernetes", "Microsoft Azure", "Google Cloud", "Tailwind", "Gatsby", "Design Patterns", "System Design",
            "Apache", "Nginx" };
    public static String[] techProjects = { "Automated Chatbot", "Sudoku Solver", "Self-driving Raspberry Pi Car",
            "Graph Algorithm Visualizer", "Discord Bot" };

    // ENGINEERING SPECIAL SKILLS x PROJECTS
    public static String[] engineerSkills = {};
    public static String[] engineeringProjects = {};

    // MATHEMATICS SPECIAL SKILLS x PROJECTS
    public static String[] mathSkills = {};
    public static String[] mathProjects = {};

    // CERTIFICATIONS
    public static String[] certifications = { "First-Aid Training" };

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Prompt user for fictional roulette player's name
        System.out.println("Give your person a name:");
        String personName = in.nextLine();
        System.out.println("Input Major:  AMS BCH BIO BME CHE CIV CME CSE ECE ESE ISE MAT MEC PHY TSM ");
        String major = in.next();
        System.out.println("Profile Name: " + personName);
        System.out.println("GPA:" + String.format("%.2f", (3 + (Math.random()))));

        // PRINT OUT THE DISTINCT PROFILE TYPES

        // SCIENCE
        if (major.equals("CHE") || major.equals("BIO") || major.equals("BCH")) {
            System.out.println("Skills: " + science());
        }
        // TECHNOLOGY
        else if (major.equals("CSE") || major.equals("ISE") || major.equals("TSM")) {
            System.out.println("Skills:" + technology());
        }
        // ENGINEERING
        else if (major.equals("BME") || major.equals("CIV") || major.equals("CME") || major.equals("ECE") || major.equals("MEC") || major.equals("ESE")) {
            System.out.println("Skills:" + engineering());
        }
        // MATHEMATICS
        else {
            System.out.println("Skills:" + mathematics());
        }
        System.out.println("Miscellaneous Experiences: " + randElem(miscExp));
    }

    // CHE BIO BCH
    public static String science() {
        ArrayList<String> resume = generateSkills(hardSkills);
        System.out.println("Experience 1: " + randElem(scienceExp));
        System.out.println("Experience 2: " + randElem(scienceExp1));
        System.out.println("Experience 3: " + randElem(scienceExp2));
        return resume.toString();
    }

    public static String technology() {
        // GENERATE SKILLS
        ArrayList<String> resume = generateSkills(hardSkills);
        System.out.println("Experience 1: " + randElem(techExp));
        System.out.println("Experience 2: " + randElem(techExp1));
        System.out.println("Experience 3: " + randElem(techExp2));

        // ADDITIONAL CS SKILLS GENERATED
        ArrayList<String> csSkills = generateSkills(csFrameworks);

        return resume.toString() + "\nCS Skills: " + csSkills.toString();
    }

    // STUB CIV MEC ECE BME ESE CME
    public static String engineering() {
        ArrayList<String> resume = generateSkills(hardSkills);
        System.out.println("Experience 1: " + randElem(engineeringExp));
        System.out.println("Experience 2: " + randElem(engineeringExp1));
        System.out.println("Experience 3: " + randElem(engineeringExp2));

        return resume.toString();
    }

    // STUB PHYS AMS MAT
    public static String mathematics() {
        ArrayList<String> resume = generateSkills(hardSkills);
        System.out.println("Experience 1: " + randElem(mathExp));
        System.out.println("Experience 2: " + randElem(mathExp1));
        System.out.println("Experience 3: " + randElem(mathExp2));

        return resume.toString();
    }

    // Random skill generation
    public static ArrayList<String> generateSkills(String[] skillArr) {
        ArrayList<String> resume = new ArrayList<String>();
        // GENERATE SKILLS
        String newSkill = randElem(skillArr);
        resume.add(newSkill);
        int skillCount = 1;

        int maxSkill = (int) (Math.random() * (skillArr.length - 5)) + 5; // minimum 5
        while (skillCount < maxSkill) {
            // reset what newSkill is
            newSkill = randElem(skillArr);
            if (!resume.contains(newSkill)) {
                resume.add(newSkill);
                skillCount++;
            }
        }
        return resume;
    }

    // Random arrayElement to select experiences
    public static String randElem(String[] arr) {
        return arr[(int) (Math.random() * arr.length)];
    }

}