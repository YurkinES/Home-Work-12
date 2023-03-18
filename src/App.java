public class App {
        public static void main(String[] args) {
            Author lTolstoy = new Author("Лев", "Толстой");
            Book warAndPeace = new Book(lTolstoy, "Война и Мир", 1869);
            Author iTurgenev = new Author("Иван", "Тургенев");
            Book fathersAndSons = new Book(iTurgenev,"Отцы и дети", 1862);
            System.out.println("warAndPeace = " + warAndPeace);
            System.out.println("fathersAndSons = " + fathersAndSons);
            fathersAndSons.setPublishingAge(1864);
            System.out.println("fathersAndSons = " + fathersAndSons);
        }
    }
