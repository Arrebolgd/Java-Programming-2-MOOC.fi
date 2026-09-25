public class OneItemBox extends Box{

    private Item Boxitem;

    public OneItemBox(Item item){
        this.Boxitem = item;
    }

    public OneItemBox(){

    }

    public void add(Item item){
        if(item == null) return;
        if(this.Boxitem != null) return;

        this.Boxitem = item;
    }

    @Override
    public boolean isInBox(Item item) {
        if(item == null) return false;
        if(this.Boxitem == null) return false;
        return this.Boxitem.equals(item);
    }


}
