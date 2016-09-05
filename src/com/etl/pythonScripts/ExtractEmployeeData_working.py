import sys
import pandas as pd
import numpy as np

path=sys.argv[1]
filepath=path.replace('\\','/')
df = pd.read_csv(filepath,header=None)

for index, row in df.iterrows():
    
    rowD=np.asarray(row)

    for cell in  rowD:
        delimitedCell=cell.split(';')
        for i in delimitedCell:
            df2=pd.DataFrame(delimitedCell)
            
    
    df3=df2.reset_index()

    print (df2.to_string(header=False,index=False))










