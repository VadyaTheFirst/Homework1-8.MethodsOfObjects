public class Main {

    public static void verifyHash(int hash1, int hash2) {

        if (hash1==hash2){
            System.out.println("Хэши объектов совпадают");
        } else {
            System.out.println("Хзши объетов не совпадают");
        }
    }

    public static void main(String[] args) {
        Author author1 = new Author("Howard", "Lovecraft");
        Author author11 = new Author("Howard", "Lovecraft");
        System.out.println(author11);


        Book book1 = new Book(1996, "Call of Ctulhu", author1);
        Book book11=new  Book(1996, "Call of Ctulhu", author1);
        System.out.println(book1);


        Author author2 = new Author("Edgar Allan", "Poe");

        Book book2 = new Book(1989, "The murder on the Morgue Street", author2);
        System.out.println(book2);
        book2.setPublishingYear(1976);


        //Сравнения по equals
        if (author1.equals(author11)) {
            System.out.println("Авторы совпадают");
        } else  {
            System.out.println("Авторы не совпадают");
        }
        System.out.println(author1.equals(author11));//реализован в классе Author
        System.out.println(author11.equals(author2));
        System.out.println(book1.equals(book11));

        //Сравнение с помощью хэширования

        verifyHash(author1.hashCode(), author1.hashCode());
        verifyHash(book1.hashCode(),book2.hashCode());
    }
}
