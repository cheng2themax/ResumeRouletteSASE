import java.util.HashMap;
import java.util.Random;
public class ActionWordRoulette {

    public static void main (String args[]){
        String[] actionWords = {"Chaired","Controlled","Coordinated","Executed","Headed","Operated","Orchestrated","Organized","Oversaw","Planned","Produced","Programmed","Administered","Built","Charted","Created","Designed","Developed","Devised","Founded","Engineered","Established","Formalized","Formed","Formulated","Implemented","Incorporated","Initiated","Instituted","Introduced","Launched","Pioneered","Spearheaded","Conserved","Consolidated","Decreased","Deducted","Diagnosed","Lessened","Reconciled","Reduced","Yielded","Accelerated","Achieved","Advanced","Amplified","Boosted","Capitalized","Delivered","Enhanced","Expanded","Expedited","Furthered","Gained","Generated","Improved","Lifted","Maximized","Outpaced","Stimulated","Sustained","Centralized","Clarified","Converted","Customized","Influenced","Integrated","Merged","Modified","Overhauled","Redesigned","Refined","Refocused","Rehabilitated","Remodeled","Reorganized","Replaced","Restructured","Revamped","Revitalized","Simplified","Standardized","Streamlined","Strengthened","Updated","Upgraded","Transformed","Aligned","Cultivated","Directed","Enabled","Facilitated","Fostered","Guided","Hired","Inspired","Mentored","Mobilized","Motivated","Recruited","Regulated","Shaped","Supervised","Taught","Trained","Unified","United","Acquired","Forged","Navigated","Negotiated","Partnered","Secured","Advised","Advocated","Arbitrated","Coached","Consulted","Educated","Fielded","Informed","Resolved","Analyzed","Assembled","Assessed","Audited","Calculated","Discovered","Evaluated","Examined","Explored","Forecasted","Identified","Interpreted","Investigated","Mapped","Measured","Qualified","Quantified","Surveyed","Tested","Tracked","Authored","Briefed","Campaigned","Co-authored","Composed","Conveyed","Convinced","Corresponded","Counseled","Critiqued","Defined","Documented","Edited","Illustrated","Lobbied","Persuaded","Promoted","Publicized","Reviewed","Authorized","Blocked","Delegated","Dispatched","Enforced","Ensured","Inspected","Itemized","Monitored","Screened","Scrutinized","Verified","Attained","Awarded","Completed","Demonstrated","Earned","Exceeded","Outperformed","Reached","Showcased","Succeeded","Surpassed","Targeted"};
        HashMap<String,Integer> word_values = new HashMap<>();
        int i = 0;
        while(i<5){
            int weight = (int)(Math.random()*100);
            int randIndex = (int)(Math.random()*actionWords.length);
            if (!word_values.containsKey(actionWords[randIndex])){
            word_values.put(actionWords[randIndex], weight);
            i++;
            }
        }
        
        // for (String word: word_values.keySet()){
        //     System.out.println("Word:" + word + "  Value: " + word_values.get(word));
        // }
        // for (int x = 0 ; x< actionWords.length; x++){
        //     System.out.println(actionWords[x]);
        // }
        
        for (int z = 0; z < actionWords.length; z++){
            System.out.println(actionWords[z]);
        }

    }
}
