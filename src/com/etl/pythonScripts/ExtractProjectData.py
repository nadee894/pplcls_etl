from StringIO import StringIO
import csv
import petl as etl
import sys


# Function definition is here

def extractData(selectedFilePath):
    csvDataTable = etl.fromcsv(selectedFilePath)
    filename = selectedFilePath
#Print csv data
    with open(filename, 'rU') as f:
        reader = csv.reader(f)
        try:
            for row in reader:
                print (row)
        except csv.Error as e:
            sys.exit('file %s, line %d: %s' % (filename, reader.line_num, e))

extractData('D:\Important\Research Final Year\Research going on work\NBQSA\Data Set\RAW_DATA\project_history.csv')
#read csv data and extract
#csvDataTable = etl.fromcsv('D:\Important\Research work\NBQSA\Data Set\RAW_DATA\project_history.csv')
#filename = 'D:\Important\Research work\NBQSA\Data Set\RAW_DATA\project_history.csv'
#Print csv data
#with open(filename, 'rb') as f:
    #reader = csv.reader(f)
    #try:
     #   for row in reader:
      #      print row
    #except csv.Error as e:
     #   sys.exit('file %s, line %d: %s' % (filename, reader.line_num, e))