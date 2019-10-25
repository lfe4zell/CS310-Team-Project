# CS310-Team-Project
Java Barcode Sorter
This is a Java program designed to receive a list of barcodes as input, 
sort through individual parts of the barcodes, and organize the information 
into sections such as Production Date, Expiration Date, Title, ID, etc., 
based on the individual criteria of the each product. 

The program converts incoming data into a hash map, and parses through data 
using the pattern matchers stored in the hash map. The pattern matchers are 
written in separate classes ranging from GS1_1 to GS1_9 and connected to the 
superclass GS1. Each barcode is processed into a class depending on its first
digit. For example, a barcode with starting with “7003…” would be sent to class GS1_7. 

This program is useful for inventory management and follows the GS1 General Standards 
which mandates how identification keys, data attributes, and barcodes must be used in business applications.

Prerequisites
Java SE Development Kit
Java IDE such as NetBeans

Built With
NetBeans
Java 8 Update 191 CPU

Authors
Paul Brasfield
Noah Walker
Linda Feazell
Tyler Lackey
csaunders621
hayabusa479
lemmonj

Acknowledgements
Jay Snellen
