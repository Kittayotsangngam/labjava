public class lab01 {
    
    public static void main(String[] args) {
        long birth = 7;
        long dead = 13;
        long movein = 45;
        long people = 312032486;
        long time = 31536000 ;
        long total1year ;
        long total2year ;
        long total3year ;
        long total4year ;
        long total5year ;

        total1year = people +(((time/birth)+(time/movein)-(time/dead))*1);
        total2year = people +(((time/birth)+(time/movein)-(time/dead))*2);
        total3year = people +(((time/birth)+(time/movein)-(time/dead))*3);
        total4year = people +(((time/birth)+(time/movein)-(time/dead))*4);
        total5year = people +(((time/birth)+(time/movein)-(time/dead))*5);

        System.out.println("people next 1 year " + total1year);
        System.out.println("people next 2 year " + total2year);
        System.out.println("people next 3 year " + total3year);
        System.out.println("people next 4 year " + total4year);
        System.out.println("people next 5 year " + total5year);

    }
}
