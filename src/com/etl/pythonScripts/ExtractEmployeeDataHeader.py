from StringIO import StringIO
import csv
import petl as etl
import sys
import os



path=sys.argv[1]
filepath=path.replace('\\','/')

def extractData(selectedFilePath):

    csvDataTable = etl.fromcsv(selectedFilePath)
    filename = selectedFilePath

    with open(filename, 'rU') as f:
        reader = csv.reader(f)
        line=reader.next()
        print line
        #try:
         #   for row in reader:
          #      print (row)
        #except csv.Error as e:
         #   sys.exit('file %s, line %d: %s' % (filename, reader.line_num, e))
extractData(filepath)
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