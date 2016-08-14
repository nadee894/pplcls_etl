import petl as etl
import sys

filePath = sys.argv[1]
fileType = sys.argv[2]

if fileType.__eq__('xml'):
    table1 = etl.fromxml(filePath)
elif fileType.__eq__('xlsx'):
    table1 = etl.fromxlsx(filePath)
elif fileType.__eq__('csv'):
    table1 = etl.fromcsv(filePath)

etl.tocsv(table1,'C:/Users/Lakshan/Desktop/RESEARCH DATA/TYPECONVERTED.csv')
