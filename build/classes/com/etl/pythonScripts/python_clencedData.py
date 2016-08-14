from petl import *
import sys

filePath = sys.argv[1]
data = sys.argv[0]
rules=data.split(",")
print("file Path arg 1 :"+filePath)
print("data  arg 0 :" +data)
print("rules : " + rules)
table = fromcsv(filePath)
Converted=convert(table,{'LEAVEPERMONTH': int,
                       'WORKHOURSPERDAY': int,
                       'AGE': int,
                       'ID' : int,
                       'PREVIOUSEXPERIENCE': int,
                       'CURRENTEXPERIENCE': int
                       });
#clenced(rmvInvalidEntry, roundNumbers, rmvDublicates, removeNull, fineTune);

#rmvInvalidEntry
if rules[0].__eq__('T'):
    table=select(Converted,lambda rec : (rec.LEAVEPERMONTH >0 or rec.LEAVEPERMONTH <31) and (rec.WORKHOURSPERDAY >4 or rec.WORKHOURSPERDAY< 12)  )

#roundNumbers
if rules[1].__eq__('T'):
    table=table
#rmvDublicates
if rules[2].__eq__('T'):
    
    table = distinct(table,'ID')
#removeNull
if rules[3].__eq__('T'):
    table=table
#sortDatase
if rules[4].__eq__('T'):
    table = sort(table,'ID')

tocsv(table,'C:/Users/Lakshan/Desktop/RESEARCH DATA/CLENCED.csv')

