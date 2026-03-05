package lesson_8;


class Seven_Wonders{
    void location(){
        System.out.println("location is : ");
    }

    void famousfor(){
        System.out.println("it is famous for : ");
    }
}

class The_Great_Wall extends Seven_Wonders{
    void location(){
        System.out.println("The_Great_Wall is in China ");
    }

    
}

class Petra extends Seven_Wonders{
    void location(){
        System.out.println("Petra is in Jordan ");
    }

    
}

class The_Colosseum extends Seven_Wonders{
    void location(){
        System.out.println("The_Colosseum is in Italy ");
    }

    
}

class Chichen_Itza extends Seven_Wonders{
    void location(){
        System.out.println("Chichen_Itza is in Mexico ");
    }

    
}

class Machu_Picchu extends Seven_Wonders{
    void location(){
        System.out.println("Machu_Picchu is in Peru ");
    }

    
}

class The_Taj_Mahal extends Seven_Wonders{
    void location(){
        System.out.println("The_Taj_Mahal is in India ");
    }

    
}

class Christ_the_Redeemer extends Seven_Wonders{
    void location(){
        System.out.println("Christ_the_Redeemer is in Brazil ");
    }

    
}


public class main_homework {
    public static void main(String[] args) {
        Seven_Wonders A=new Seven_Wonders();
        Seven_Wonders G=new The_Great_Wall();
        Seven_Wonders P=new Petra();
        Seven_Wonders Co=new The_Colosseum();
        Seven_Wonders C=new Chichen_Itza();
        Seven_Wonders M=new Machu_Picchu();
        Seven_Wonders T=new The_Taj_Mahal();
        Seven_Wonders Ch=new Christ_the_Redeemer();

        A.location();

        G.location();

        P.location();

        Co.location();

        C.location();

        M.location();

        T.location();

        Ch.location();

    }
}
