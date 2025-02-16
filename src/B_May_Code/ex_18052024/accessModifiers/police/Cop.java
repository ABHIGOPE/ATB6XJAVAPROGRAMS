package B_May_Code.ex_18052024.accessModifiers.police;

public class Cop {
        public int gun; // access by anyone
        private String idCard; // available in this class
        public Cop(int gun){
            this.gun=gun;
        }
        protected void canIShoot(){
            System.out.println("Yes Ofcourse");
        }


    }

