import urllib2
url='http://aima.cs.berkeley.edu/data/iris.csv'
u=urllib2.urlopen(url)
localFile=open('iris.cvs','w')
localFile.write(u.read())
localFile.close()
