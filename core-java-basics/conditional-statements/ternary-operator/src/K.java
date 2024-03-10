class K{
    public static void main(String[] args){
        if(args.length < 2) {
            System.out.println("supply 3 command line agruments");
            return;
        }
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
        int min = i < j ? (i < k ? i : k) : (j < k ? j : k);
        System.out.println("min b/w "+i+" and "+j+" and "+ k + " is " +min);

    }
}
