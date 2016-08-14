from StringIO import StringIO
import csv
import petl as etl
import sys
import pandas as pd
import json
import itertools
import numpy as np
from numpy import genfromtxt
import os
from StringIO import StringIO
from itertools import dropwhile
import re


df = pd.read_csv('D:\Important\Research Final Year\Research going on work\NBQSA\Data Set\RAW_DATA\project_history.csv',header=None,skiprows=1)
#columns=df.columns.values
for index, row in df.iterrows():
    #numpyMatrix = row.as_matrix()
    #rowData=row.as_matrix()
    rowD=np.asarray(row)

    for cell in  rowD:
        delimitedCell=cell.split(';')
        for i in delimitedCell:
            df2=pd.DataFrame(delimitedCell)
            #print cell[0],cell
    #print index,delimitedCell
    df3=df2.reset_index()

    print df2.to_string(header=False,index=False)

            #df2.to_csv('example.csv')
            #print i

    #print index,delimitedCell
    #rowDelimitedData=np.genfromtxt(rowD, delimiter=";")
    #rowDataArray = np.squeeze(np.asarray(rowData))
    #rowD.dtype(str,100)
    #rowDelimitedData=rowD.split(';',rowD)
   # rowDelimitedData=np.core.defchararray.split(rowDataArray, sep=';')
    #rowDelimitedData=np.fromstring(row, dtype=int, sep=";")
    #print index,rowDelimitedData
#for row in df.rows:
 #       print row
#df = pd.DataFrame([line.split(";") for line in df])
#print df





#df = pd.read_csv('employee_data.csv')
#df2 = pd.DataFrame([df.split(",") for df in l])
#for row in df.rows:
 #       print row["id"]
#dict_data=df.to_dict(orient='records')
#for line in df:
 #       print line






#dict_row=dict()

#dict_row=df.set_index('id').T.to_dict('list')
#print dict_row
#for key in dict_row:
        #print (key, dict_row[key])
 #       dict_cell=[]
  #      dict_cell=df.set_index('id').T.to_dict('list')
   #     for value in dict_cell[key]:
    #           dict_row[key]
               # print value








#print dict_data









