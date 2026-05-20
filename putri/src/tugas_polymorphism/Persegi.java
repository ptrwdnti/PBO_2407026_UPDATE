// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package tugas_polymorphism;

public class Persegi extends BangunDatar {
   public Persegi(double var1) {
      super(var1);
   }

   public double hitungLuas() {
      return this.getVarA() * this.getVarA();
   }

   public void tampilkan() {
      System.out.println("Persegi");
      System.out.println("Sisi: " + this.getVarA());
      System.out.println("Luas: " + this.hitungLuas());
      System.out.println("----------------------");
   }
}
