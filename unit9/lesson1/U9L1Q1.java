public class SpecialityCoffee extends Coffee {
  private String flavor;

  public SpecialityCoffee() {
    super();
    flavor = "vanilla";
  }

  public SpecialityCoffee(String size, String type, String flavor) {
    this(size, false, 1, type, flavor);
  }

  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor) {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  public int getPrice() {
    int p = super.getPrice();

    if (flavor != null) {
      p += 50;
    }

    else if (super.getSize().equals("large") || super.getSize().equals("extra large")) {
      p += 70;
    }
    else {
      p += 50;
    }
    return p;
  }
  public String toString() {
    return super.toString() + " with " + flavor;
  }
}