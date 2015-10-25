(ns atreyu.ring.middleware.json-info
  "Middleware that adds Content-Type: application/json header to the response."
  (:require [ring.util.request :as req]
            [ring.util.response :refer [content-type]])

  (defn json-info-response
    "Adds Content-Type: application/json header to the response."
    {:argslist '([response request] [response request mime-types])}
    [{:keys [body] :as response} req & [mime-types]]
    (-> response
        (content-type "application/json")))
