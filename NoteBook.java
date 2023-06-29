public class NoteBook {
    public String OS;
    public Integer RAM;
    public String Model;
    public Integer HDD;
    public String Brand;
    public Integer SerialNumber;
    public boolean isBooked = false;


    public NoteBook(String Model, Integer SerialNumber, String Brand){
        this.Model = Model;
        this.Brand = Brand;
        this.SerialNumber = SerialNumber;

        System.out.println("Ноутбук марки " + this.Brand + "," + "Модель " + (String) this.Model + "," + "Серийный номер " +
                this.SerialNumber);
    }

    public String getOS(){
        return this.OS;
    }

    public Integer getRAM(){
        return this.RAM;
    }

    public String getModel(){
        return this.Model;
    }

    public Integer getHDD(){
        return this.HDD;
    }

    public String getBrand(){
        return this.Brand;
    }

    public Integer getSerialNumber(){
        return this.SerialNumber;
    }

    public Boolean getBooking() {
        return this.isBooked;
    }

    public void setHDD(int i){
        this.HDD = HDD;
    }

    public void setRAM(int i){
        this.RAM = RAM;
    }

    public void setOS(String string){
        this.OS = OS;
    }

    public void Book() {
        if (isBooked == false) {
            this.isBooked = true;
        } else
            System.out.println("Ноутбук забронирован ");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.SerialNumber);
        sb.append(System.lineSeparator());
        sb.append(this.Brand);
        sb.append(" ");
        sb.append(this.Model);
        sb.append(System.lineSeparator());
        sb.append("OS " + this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD " + this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM " + this.RAM);
        sb.append(System.lineSeparator());
        if (this.isBooked == false)
            sb.append("Не резерв ");
        else
            sb.append("Резерв ");

        return (sb.toString());


    }
}
