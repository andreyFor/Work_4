public class work4 {
    public static void main(String[] args) {
        System.out.println("приветик");
        //Задание номер 1

        int i = 1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (i=10; i>0; i--){
            System.out.print(i+" ");
        }

        // Задание номер 2

        int friday = 1;
        for (friday = 1; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }


        // Задание номер 3

        int currentYear = 2022;
        int yearOfComet = 0;
        for (yearOfComet = currentYear - 200; yearOfComet <= 2122; yearOfComet = yearOfComet + 1 ) {
            if (yearOfComet % 79 == 0) {
                System.out.println(yearOfComet);
            }
        }



    }


}
