package OtherProjects.hust.soict.dsai.garbage;

public class ConcatenationInLoops {

    public static void main(String[] args) {

        int n = 100000;
        long start1 = System.currentTimeMillis();

        String s1 = "";
        for (int i = 0; i < n; i++) {
            s1 += "a";
        }

        long end1 = System.currentTimeMillis();
        System.out.println("String (+): " + (end1 - start1) + " ms");
        long start2 = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end2 - start2) + " ms");
        long start3 = System.currentTimeMillis();

        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbd.append("a");
        }

        long end3 = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end3 - start3) + " ms");
    }
}
