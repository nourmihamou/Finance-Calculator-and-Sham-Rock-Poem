
/**
 * This program outputs the poem "Five Little Shamrocks" with special characters.
 *
 * @author Nour M, Lulama N.
 * @version 03/12/2021
 */
public class FiveLittleShamrocks
{
    public static void main(String[]args)
    {
        final char SHAM = '\u2667';
        final char DING1 = '\u2780';
        final char DING2 = '\u2781';
        final char DING3 = '\u2782';
        final char DING4 = '\u2783';
        final char DING5 = '\u2784';

        System.out.println();
        System.out.println(""+ SHAM + SHAM + SHAM + SHAM + SHAM + " Five Little Shamrocks " + SHAM + SHAM + SHAM + SHAM + SHAM);
        System.out.println("\t" + DING1 + " green " + SHAM + ", in the morning dew,");
        System.out.println("\tAnother one sprouted, \n \tand then there were " + DING2 + ".");

        System.out.println();
        System.out.println("\t" + DING2 + " green " + SHAM + "s, growing beneath a tree;");
        System.out.println("\tAnother one sprouted, \n \tand then there were " + DING3 + ".");
        System.out.println();

        System.out.println("\t" + DING3 + " green " + SHAM + "s, by the cottage door;");
        System.out.println("\tAnother one sprouted, \n \tand then there were " + DING4 + ".");
        System.out.println();

        System.out.println("\t" + DING4 + " green " + SHAM + "s, near a beehive");
        System.out.println("\tAnother one sprouted, \n \tand then there were " + DING5 + ".");
        System.out.println();

        System.out.println("\t" + DING5 + " green " + SHAM + "s, bright and emerald green,");
        System.out.println("\tThink of all the luck \n \tthese " + SHAM + "s will bring.");

    }
}
