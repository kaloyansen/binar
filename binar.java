class binar {/* calculer deux au n-tième degré
code original - kaloyansen@gmail.com */
     private int x;
     private long y = 2;
     binar(int x) {
          for (int i = 1; i < x; i++) { this.y *= 2; }
          if (x == 0) { this.y = 1; }
          if (this.y <= 0) {
               sop("warning this calculation does not work for a value of y greater than 62");
               sop("and so it will definitely not work for a value as high as " + x);
          }
          this.x = x;
     }

     static int toint(String s) {
          int i = 0;
          try { i = Integer.parseInt(s); }
          catch (NumberFormatException e) { sop("warning '" + s + "' is not a number"); }
          return i;
     }

     static int oneintarg(String[] args) {
          int arle = args.length;
          if (arle == 0) {// no arguments detected will return zero
               sop("warning int argument expected the code set to default zero");
               return 0;
          }
          if (arle > 1) { // too many arguments not fatal just warning
               sop("warning one int argument expected the code ignores any other");
          }
          return toint(args[0]);
     }

     public static void main(String[] args) {
          int intarg = oneintarg(args);
          binar bin = new binar(intarg);
          sop("2 au " + bin.x + "-thème degré et " + bin.y);
     }

     public static void sop(String s) { System.out.println(s); }
}
