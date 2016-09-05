import csv
import petl as etl
import sys


# Function definition is here

def extractData(selectedFilePath,header):
    csvDataTable = etl.fromcsv(selectedFilePath,header=None)
    filename = selectedFilePath
#Print csv data
    with open(filename, 'rU') as f,open('C:\\Users\\Nadeesha\\Documents\\modified.csv','w', newline='') as f2:
        reader = csv.reader(f)
        f.__next__()
        writer=csv.writer(f2)
        writer.writerow(['['+header+']'])
        try:
            for row in reader:
                #print (row)
                writer.writerow([row])
        except csv.Error as e:
            sys.exit('file %s, line %d: %s' % (filename, reader.line_num, e))

extractData(sys.argv[1],sys.argv[2])
#extractData('D:\Important\Research Final Year\Research going on work\NBQSA\Data Set\RAW_DATA\employee_data.csv')
#extractData('C:\Users\Gaya\Desktop\etl data\etl_data.csv')
#read csv data and extract
#csvDataTable = etl.fromcsv('D:\Important\Research work\NBQSA\pythin scripts\RAW_DATA\employee_data.csv')
#filename = 'D:\Important\Research work\NBQSA\pythin scripts\RAW_DATA\employee_data.csv'
#Print csv data
#with open(filename, 'rb') as f:
    #reader = csv.reader(f)
    #try:
     #   for row in reader:
      #      print row
    #except csv.Error as e:
     #   sys.exit('file %s, line %d: %s' % (filename, reader.line_num, e))