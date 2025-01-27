class Supplier{
    private String name;
    private String email;
    private String address;

    public Supplier(String name, String email, String address){
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public String display(){
        return "Name: "+name+", Email: "+email+", Address: "+address;
    }
}