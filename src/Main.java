public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Email("jodae", "jodae@gmail.com");
        contact1.contact();
        Contact contact2 = new Email.Phone("jodae", "6147623455");
        contact2.contact();
    }
}
abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public abstract void contact();
}


class Email extends Contact {
    private String email;



    public Email(String name, String email){
        super(name);
        this.email = email;
}

    @Override
    public void contact() {
        System.out.println("emailing " + email);
    }

    static class Phone extends Contact {

        private String number;

        public Phone(String name, String number){
            super(name);
            this.number = number;
        }

        @Override
        public void contact() {
            System.out.println("dialing " + number);
        }
    }
}
