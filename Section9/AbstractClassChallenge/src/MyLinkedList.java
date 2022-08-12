public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) { // Part1 11:36
        if (this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(newItem);

            if(comparison < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }

        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if(listItem != null){
            System.out.println("Deleting item " + listItem.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(listItem);
            if (comparison == 0){
                if (currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() !=null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0){
                currentItem = currentItem.next();
            } else { //comparison > 0
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem listItem) {
        if (listItem == null){
            System.out.println("The list is empty");
        } else {
            while (listItem != null) {
                System.out.println(listItem.getValue());
                listItem = listItem.next();
            }
        }

//        if (listItem != null){
//            System.out.println(listItem.getValue());
//            traverse(listItem.next());
//        }

    }
}
