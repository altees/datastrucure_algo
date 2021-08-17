public class BinarySearchTest {
    public static int binarySearch(int a[], int numToBeFind) {
        int startIndex = 0, mid = 0, endIndex = a.length - 1;
        while (startIndex <= endIndex) {
            mid = (startIndex + endIndex) / 2;
            if (a[mid] < numToBeFind) {
                startIndex = mid + 1;
            } else if (a[mid] > numToBeFind) {
                endIndex = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numToBeFind = 90;
        int[] a = {3, 7, 32, 45, 87, 90, 935, 1003, 2345, 4003, 4030, 4080, 5002};

        System.out.println(binarySearch(a, numToBeFind));

    }
}

 /*   if (a[mid] > numToBeFind) {
            endIndx=mid;
            mid = (endIndx - startIndx) / 2;
            }else if (a[mid] < numToBeFind) {
        startIndx=mid;
        mid = (endIndx + startIndx) / 2;
        }else
        {
        notFound=true;
        System.out.println("found at index "+ mid);
        }
*/