public class Invoice {

String num, desc;
int quant;
double price;

public Invoice(String num, String desc, int quant, double price) {
    this.num = num;
    this.desc = desc;
    if(quant>=0)this.quant = quant;
    if(price>=0.0) this.price = price;
}

}
