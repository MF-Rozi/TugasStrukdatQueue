import com.sun.org.apache.xpath.internal.operations.Or;

public class Queue {
    private Order data[];
    private int tail;
    private int queue;

    public Queue(int jumlah) {
        FoodandDrink[] a = new FoodandDrink[5];
        a[0] = new FoodandDrink(0,"kola",5000);
        a[1] = new FoodandDrink(1,"Mijon",4000);
        a[2] = new FoodandDrink(2,"pepsi",6000);
        a[3] = new FoodandDrink(3,"Burger",10000);
        a[4] = new FoodandDrink(4,"Winger",20000);
        print(a);

        data = new Order[jumlah];
        tail = -1;
        queue = 0;
    }

    public void enqueue(Order a) {
        if (tail < data.length-1) {
            queue++;
            data[++tail] = a;
        }
    }

    public Order dequeue() {

        if(tail >= 0) {
            Order temp = data[0];
            for (int i = 0; i < data.length-1; i++) {
                data[i] = data[i+1];
            }
            queue--;
            tail--;
            return temp;
        }
        return null;
    }


    public void print() {
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i] + " ");
        }
    }
    private void print(FoodandDrink a[]){
        System.out.println("======================");
        System.out.println("Daftar Menu : ");
        System.out.println("======================");

        for (int i = 0; i <a.length ; i++) {
            System.out.printf("Nama : %s\nKode :%d\nHarga :%d\n",a[i].getNama(),a[i].getKode(),a[i].getHarga());
        }
        System.out.println("======================");
    }
}
