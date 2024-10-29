# VMAX Plugin for Magic Systems of Systems Architect

This repository contains an implementation of the VMAX interface for Magic Systems Of Systems Architect.

# The VMAX interface

## General idea

The idea of the VMAX interface is to provide a reusable interface for software featuring an API, that allows RDF-based access to the information available from the API.

Two options to access the interface are available:

- A triple pattern based interface.
The central idea of the VMAX interface is to abstract object oriented data from APIs as triples of an RDF knowledge graph.
Within the VMAX core library, the mapping from object oriented data to RDF triples is defined. 
The information available from the API can therefore be abstracted as a set of triples, i.e. a knowledge graph.
To query this graph, a logic to execute triple pattern queries is defined by the VMAX core library.

- The second option is to query the information using SPARQL.
This is realized by using the Apache Jena framework, specifically its query processor ARQ.
The query processor can execute SPARQL queries and uses the triple pattern interface to access the abstracted data of the API. 

## Implementation

The general idea explained above was developed during my research on interoperability in engineering using Semantic Web technologies. 
Please refer to the section [References](#references) if you are interested in the scientific background of this.

Within this and other repositories (see [Links](#links)), implementations of the approaches of my research are provided.
The implementations are no production-ready libraries and are only meant to demonstrate and evaluate my research. 
This also means, that while the scientific approach describes a general interface for APIs of object oriented software, the VMAX interface was only implemented for Java-based APIs.  

# How to use

Step **(1)** -
This implementation of the VMAX interface is intended for the modeling software Magic Systems Of Systems Architect.
An installation of this software is required.
This implementation might also work for similar tools, such as Magic Draw or Cameo Systems Modeler - this has not been tested however.

Step **(2)** -
This library requires the [VMAX Core](https://github.com/mxweigand/vmax_core) library. 
Follow the link, download the source code and build a JAR file by running `mvn clean package`.

Step **(3)** -
Download the source code of this repository.

Step **(4)** -
Open the [`pom.xml`](./pom.xml) file of this repository and go to the `<properties>` section.
Set the properties 
- `<toolDirectory>`: To the path to the `lib` folder of your Magic Systems Of Systems Architect installation.
- `<vmaxCoreDirectory>`: To the path where you downloaded the VMAX Core library. The path should point to the folder containing the whole Java project, not the `target` folder.

Step **(5)** -
Run `mvn clean package` to build the JAR file of this repository.

Step **(6)** -
Copy the folder [`com.vmax.vmax_plugin`](./plugin/com.vmax.vmax_plugin_msosa/) (from the folder [`plugin`](./plugin/)) to the `plugins` folder of your Magic Systems Of Systems Architect installation.
The folder [`com.vmax.vmax_plugin`](./plugin/com.vmax.vmax_plugin_msosa/) already contains the [`plugin.xml`](./plugin/com.vmax.vmax_plugin_msosa/plugin.xml) file.
Into this folder, copy the following JAR files:
- The VMAX Core JAR file: `vmax_core-0.0.1.jar` created in step **(2)**.
- The VMAX Plugin JAR file: `vmax_plugin_msosa_0.0.1.jar` created in step **(5)**.
- The Apache Jena JAR Files 
[`jena-fuseki-access-5.1.0`](https://repo1.maven.org/maven2/org/apache/jena/jena-fuseki-access/5.1.0/jena-fuseki-access-5.1.0.jar), 
[`jena-fuseki-main-5.1.0`](https://repo1.maven.org/maven2/org/apache/jena/jena-fuseki-main/5.1.0/jena-fuseki-main-5.1.0.jar) and 
[`jena-fuseki-fulljar-5.1.0`](https://repo1.maven.org/maven2/org/apache/jena/jena-fuseki-fulljar/5.1.0/jena-fuseki-fulljar-5.1.0.jar). 
You can download these by following the given links.

Step **(7)** -
Start Magic Systems Of Systems Architect and open a project.

Step **(8)** -
Go to the menu `Tools` and click on `Start VMAX`.

Step **(9)** -
Query the SPARQL interface, e.g. by using `curl`:
    
    curl http://localhost:3030/data/query -X POST --data 'query=SELECT * WHERE { ?s ?p ?o . }' -H 'Accept: text/plain'

# Links

- [VMAX Core](https://github.com/mxweigand/vmax_core) 
The core library of the VMAX interface.

- [VMAX API Documentation Browser](https://github.com/mxweigand/vmax_api_doc_browser)
A web-based tool to automate and support the creation of implementations of the VMAX interface for specific APIs. 
The tool enables users to explore the Javadoc API documentation and create and the interface by selecting relevant components of the API from the Javadoc.

# References

The following publications provide further insights into my research:

- Weigand, M. and Fay, A. (2022). *Creating Virtual Knowledge Graphs from Software-Internal Data.* IECON 2022 – 48th Annual Conference of the IEEE Industrial Electronics Society. [DOI: 10.1109/IECON49645.2022.9969051](https://doi.org/10.1109/IECON49645.2022.9969051).

- Weigand, M. (2023). *Triple Pattern Interfaces for Object-Oriented Software APIs.* Doctoral Consortium at ISWC 2023 co-located with 22nd International Semantic Web Conference (ISWC 2023). [Link](https://ceur-ws.org/Vol-3678/paper8.pdf).

- Weigand, M.; Gehlhoff, F. and Fay, A. (2024). *Extracting API Structures from Documentation to Create Virtual Knowledge Graphs.* 16th International Joint Conference on Knowledge Discovery, Knowledge Engineering and Knowledge Management - Volume 2: KEOD. 

# License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
