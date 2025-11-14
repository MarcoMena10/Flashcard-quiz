import java.util.ArrayList;

public class FlashCardSet 
{
    static ArrayList<FlashCard> set = new ArrayList<FlashCard>();

    public static void fillSet() 
    	{

        // ------------------------
        // IMPORTANT FIGURES
        // ------------------------
        set.add(new FlashCard("Abraham Lincoln",
            "His election in 1860 convinced many southerners that slavery’s days were numbered, leading directly to secession.",
            "Important Figures", 3, false));

        set.add(new FlashCard("John C. Calhoun",
            "Leading defender of slavery; proclaimed slavery a 'positive good' in 1837.",
            "Important Figures", 4, false));

        set.add(new FlashCard("James Henry Hammond",
            "South Carolina senator and planter who argued that Black people were racially suited for servitude.",
            "Important Figures", 3, false));

        set.add(new FlashCard("Nat Turner",
            "Literate slave preacher who led the most significant slave revolt in U.S. history in 1831, killing 57 whites before being suppressed.",
            "Important Figures", 4, false));

        set.add(new FlashCard("Gabriel Prosser",
            "Slave blacksmith who organized a large planned revolt in 1800 to capture Richmond, Virginia; the plot failed due to betrayal.",
            "Important Figures", 3, false));

        set.add(new FlashCard("Denmark Vesey",
            "Free Black man in Charleston who organized a massive slave conspiracy in 1822; the plan was uncovered before it began.",
            "Important Figures", 3, false));

        set.add(new FlashCard("Harriet Tubman",
            "Most famous 'conductor' on the Underground Railroad, personally leading dozens to freedom.",
            "Important Figures", 2, false));

        set.add(new FlashCard("Frederick Douglass",
            "Former enslaved person and abolitionist writer/speaker who said slave songs expressed the sorrow of slaves’ hearts.",
            "Important Figures", 2, false));

        set.add(new FlashCard("Hinton Rowan Helper",
            "Author of 'The Impending Crisis of the South' (1857), condemning slavery for impoverishing poor whites; banned in the South.",
            "Important Figures", 3, false));

        set.add(new FlashCard("George Fitzhugh",
            "Proslavery intellectual who argued that slavery was beneficial to both masters and slaves.",
            "Important Figures", 4, false));

        set.add(new FlashCard("Toussaint Louverture",
            "Leader of the Haitian Revolution; established Haiti as the second independent republic in the Western Hemisphere in 1804.",
            "Important Figures", 3, false));

        set.add(new FlashCard("Mary Chesnut",
            "South Carolina planter’s wife who wrote a diary documenting plantation life and the problem of interracial relations.",
            "Important Figures", 2, false));

        set.add(new FlashCard("Colonel Daniel Jordan",
            "Slave master at Laurel Hill, South Carolina, who owned 261 slaves.",
            "Important Figures", 1, false));

        // ------------------------
        // IMPORTANT DATES
        // ------------------------
        set.add(new FlashCard("1731–1823",
            "Jamaica averaged one major slave revolt per year during this period.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1776",
            "Slavery existed as a national institution throughout the Americas.",
            "Important Dates", 2, false));

        set.add(new FlashCard("1800",
            "Gabriel Prosser's failed slave rebellion occurred in Virginia.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1804",
            "Haiti declared independence following a successful slave revolt led by Toussaint Louverture.",
            "Important Dates", 2, false));

        set.add(new FlashCard("1815–1860",
            "Era of the 'cotton kingdom' expansion; westward migration and increased cotton production.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1820",
            "Missouri Compromise temporarily settled the issue of slavery’s expansion.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1822",
            "Denmark Vesey’s slave conspiracy discovered in Charleston.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1831",
            "Nat Turner's Rebellion in Virginia; led to harsher slave laws and suppression of emancipation advocacy.",
            "Important Dates", 4, false));

        set.add(new FlashCard("1832",
            "Virginia legislature held last major debate over gradual emancipation (73–58 vote against).",
            "Important Dates", 3, false));

        set.add(new FlashCard("1832–1833",
            "Nullification Crisis between South Carolina and the federal government over tariffs.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1837",
            "John C. Calhoun publicly proclaimed slavery a 'positive good'; economic depression begins.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1844–1845",
            "Methodist and Baptist churches split along sectional lines over slavery.",
            "Important Dates", 2, false));

        set.add(new FlashCard("1850",
            "Compromise of 1850 enacted; attempted to ease sectional tensions.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1852",
            "Harriet Beecher Stowe’s 'Uncle Tom’s Cabin' published; outraged the South.",
            "Important Dates", 2, false));

        set.add(new FlashCard("1854",
            "Kansas-Nebraska Act opened new territories to slavery by popular sovereignty.",
            "Important Dates", 3, false));

        set.add(new FlashCard("1857",
            "Publication of Hinton Helper’s 'The Impending Crisis of the South'.",
            "Important Dates", 2, false));

        set.add(new FlashCard("1860",
            "Abraham Lincoln elected president; seven southern states soon secede.",
            "Important Dates", 4, false));

        set.add(new FlashCard("1860–1861",
            "Seven southern states seceded and formed the Confederate States of America.",
            "Important Dates", 4, false));

        // ------------------------
        // IMPORTANT EVENTS
        // ------------------------
        set.add(new FlashCard("Alabama Fever",
            "Mass migration of settlers westward into fertile lands after the War of 1812 to expand cotton cultivation.",
            "Important Events", 2, false));

        set.add(new FlashCard("Westward Expansion of Cotton",
            "Driven by textile industry demand; planters moved into Alabama, Mississippi, and Texas.",
            "Important Events", 3, false));

        set.add(new FlashCard("Upper South’s Shift to Wheat/Corn",
            "Upper South turned from tobacco to grain production, selling surplus enslaved laborers to the Deep South.",
            "Important Events", 3, false));

        set.add(new FlashCard("Slave Revolts",
            "Rebellions such as those led by Prosser, Vesey, and Turner terrified white southerners and led to stricter slave codes.",
            "Important Events", 4, false));

        set.add(new FlashCard("Second Great Awakening",
            "Religious revival that converted many enslaved people, spreading Methodist and Baptist influence.",
            "Important Events", 2, false));

        set.add(new FlashCard("The Virginia Debate of 1832",
            "Last major southern legislative debate over slavery; proposal for gradual emancipation narrowly defeated.",
            "Important Events", 3, false));

        set.add(new FlashCard("Development of the Proslavery Argument",
            "Shift after 1830 to portraying slavery as a 'positive good' rather than a necessary evil.",
            "Important Events", 4, false));

        set.add(new FlashCard("Sectional Splits in Churches",
            "Major Protestant denominations divided into northern and southern branches over slavery.",
            "Important Events", 2, false));

        set.add(new FlashCard("Election of Abraham Lincoln (1860)",
            "Convinced southern states that federal power would threaten slavery, leading to secession.",
            "Important Events", 3, false));

        set.add(new FlashCard("Secession and Formation of the Confederacy",
            "Southern states seceded from the Union to preserve slavery and states' rights.",
            "Important Events", 4, false));

        // ------------------------
        // IMPORTANT LAWS
        // ------------------------
        set.add(new FlashCard("Missouri Compromise (1820)",
            "Temporarily eased tensions over slavery’s expansion by admitting Missouri as a slave state and Maine as a free state.",
            "Important Laws", 3, false));

        set.add(new FlashCard("Compromise of 1850",
            "Admitted California as a free state and included a stricter Fugitive Slave Law; temporarily calmed tensions.",
            "Important Laws", 3, false));

        set.add(new FlashCard("Kansas-Nebraska Act (1854)",
            "Allowed settlers in new territories to decide on slavery by popular sovereignty; led to 'Bleeding Kansas'.",
            "Important Laws", 4, false));

        set.add(new FlashCard("Legal Restrictions on Free Blacks",
            "After Nat Turner’s revolt, southern states increased restrictions on free Blacks: banning voting, assembly, and requiring freedom papers.",
            "Important Laws", 4, false));

        set.add(new FlashCard("Slave Codes",
            "Laws forbidding enslaved people from owning property, carrying weapons, assembling, or learning to read/write.",
            "Important Laws", 4, false));

        set.add(new FlashCard("Abolitionist Propaganda Bans",
            "After 1830, southern states made abolitionist literature illegal and censored anti-slavery mail.",
            "Important Laws", 3, false));
    }

    public ArrayList<FlashCard> getSet() 
    {
        return set;
    }

   
}
