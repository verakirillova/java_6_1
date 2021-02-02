package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageValue (long [] sales) {
      long value = 0;

      for (long sale: sales) {
          value += sale;
      }

      value = value / sales.length;
      return value;
    }

    public long maxSales (long [] sales) {
        long currentMax = 0;
        long maxPosition = 0;
        long index = 0;

        for (long sale: sales) {
            if (sale >= currentMax) {
                currentMax=sale;
                maxPosition = index+1;
            }
            index++;
        }

        return maxPosition;
    }

    public long minSales (long [] sales) {
        long currentMin = sales[0];
        long minPosition = 1;
        long index = 0;

        for (long sale : sales) {
            if (sale <= currentMin) {
                currentMin = sale;
                minPosition = index + 1;
            }
            index++;
        }
        return minPosition;
    }
    public long countLessAverage (long [] sales) {
        long avg = this.averageValue(sales);
        long count = 0;

        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }
    public long countMoreAverage (long [] sales) {
        long avg = this.averageValue(sales);
        long count = 0;

        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}
