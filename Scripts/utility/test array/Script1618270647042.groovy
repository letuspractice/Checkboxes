
//https://blog.mrhaki.com/2020/02/groovy-goodness-shuffle-list-or-array.html
//https://stackoverflow.com/questions/3981420/why-does-collections-shuffle-fail-for-my-array

Integer[] arr = new Integer[100];

for (int i = 0; i < arr.length; i++) {
	arr[i] = i;
}

Collections.shuffle(Arrays.asList(arr));

for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
}