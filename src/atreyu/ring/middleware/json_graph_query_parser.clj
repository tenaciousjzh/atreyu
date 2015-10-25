(ns atreyu.ring.middleware.json-graph-query-parser
  (:require [clojure.data.json :as json]
            [ring.util.request :as req]
            [ring.middleware.keyword-params :as key-params]
            [ring.middleware.params :as params]))

;; JSON-Graph queries come in the following format:
;; endpoint?path=[("path-indexer-key1" | index-num), ..., ("path-indexer-keyn""|index-n)]
;; example: /model.json?path=["genreList", 0, "titles", 0, "name"]

(defn parse-query [request]
  )

(defn parse-json-graph-query
  "This is a ring handler that parses query parameters and extracts a JSON Graph
Path query. It adds a vector of the desired path bits to pull out from the
source Graph into the request map.

This function returns a partial function that accepts a request parameter and
calls the provided handler passing back the parsed json graph query."
  [handler]
  (fn [request]
    (let [req (-> (params request) ;adds :query-params into request
                  (keyword-params ))] ;converts string keys to symbols {"k" "v"} => {:k "v"}
      (handler (parse-query req)))))
